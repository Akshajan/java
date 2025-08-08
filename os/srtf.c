#include <stdio.h>

void findWaitingTime( int n,int processes[],int at[], int bt[], int wt[]) {
    int rt[n]; 
    for (int i = 0; i < n; i++) {
        rt[i] = bt[i]; // Initialize remaining times with burst times
    }

    int completed = 0, t = 0; // t is the current time
    int min_remaining_time, shortest, check;

    while (completed != n) {
        min_remaining_time = 999999;
        shortest = -1;
        check = 0;
       
        for (int i = 0; i < n; i++) {
            if (at[i] <= t && rt[i] < min_remaining_time && rt[i] > 0) {
                min_remaining_time = rt[i];
                shortest = i;
                check = 1;
            }
        }
        // If no process is found, just increment time
        if (check == 0) {
            t++;
            continue;
        }

        rt[shortest]--;
        if (rt[shortest] == 0) {
            completed++;
            int finish_time = t + 1;
            wt[shortest] = finish_time - at[shortest] - bt[shortest];
            if (wt[shortest] < 0) {
                wt[shortest] = 0; // Avoid negative waiting time
            }
        }
        t++;
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
    }
}

void findAverageTime(int n,int processes[] , int at[] ,int bt[] ){
    int wt[n], tat[n];
    int total_wt = 0, total_tat = 0;

    // Find waiting time for each process
    findWaitingTime( n,processes, at, bt, wt);

    // Find turnaround time for each process
    findTurnAroundTime(processes, n, bt, wt, tat);

    // Calculate total waiting time and total turnaround time
    for (int i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
    }

    // Print results
    printf("Process\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i], bt[i], at[i], wt[i], tat[i]);
    }

    printf("\nAverage waiting time: %.2f\n", (float)total_wt / n);
    printf("Average turnaround time: %.2f\n", (float)total_tat / n);
}

int main() {
    int n;

    // Number of processes
    printf("Enter number of processes: ");
    scanf("%d", &n);

    int processes[n], burst_time[n], arrival_time[n];

    // Process IDs (we assume processes are labeled 1, 2, 3, ...)
    printf("Enter burst times and arrival times for each process: \n");
    for (int i = 0; i < n; i++) {
        processes[i] = i + 1; // Process ID (1, 2, 3, ...)
        printf("Burst time for process %d: ", processes[i]);
        scanf("%d", &burst_time[i]);
        printf("Arrival time for process %d: ", processes[i]);
        scanf("%d", &arrival_time[i]);
    }

    // Calculate and display average waiting time and turnaround time
    findAverageTime(processes, n, burst_time, arrival_time);

    return 0;
}
