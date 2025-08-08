#include <stdio.h>

void findWaitingTime(int processes[], int n, int bt[], int wt[]) {
    wt[0] = 0; 
    for (int i = 1; i < n; i++) {
        wt[i] = bt[i - 1] + wt[i - 1]; // waiting time is sum of previous burst times
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    
    for (int i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];// Turnaround time is the sum of burst time and waiting time
    }
}

void findAverageTime(int processes[], int n, int bt[]) {
    int wt[n], tat[n];
    int total_wt = 0, total_tat = 0;

    // Find waiting time for each process
    findWaitingTime(processes, n, bt, wt);

    // Find turnaround time for each process
    findTurnAroundTime(processes, n, bt, wt, tat);

    // Calculate total waiting time and total turnaround time
    for (int i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
    }

    // Print results
    printf("Process\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\n", processes[i], bt[i], wt[i], tat[i]);
    }

    printf("\nAverage waiting time: %.2f\n", (float)total_wt / n);
    printf("Average turnaround time: %.2f\n", (float)total_tat / n);
}

void sortByBurstTime(int processes[], int bt[], int n) {
    int temp, i, j;
    for (i = 0; i < n ; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (bt[j] > bt[j+1]) {
                temp = bt[j];
                bt[j] = bt[j+1];
                bt[j+1] = temp;

                temp = processes[j];
                processes[j] = processes[j+1];
                processes[j+1] = temp;
            }
        }
    }
}

int main() {
    int n;

    printf("Enter number of processes: ");
    scanf("%d", &n);

    int processes[n], burst_time[n];

    printf("Enter burst times for each process: \n");
    for (int i = 0; i < n; i++) {
        processes[i] = i + 1; // Process ID (1, 2, 3, ...)
        printf("Burst time for process %d: ", processes[i]);
        scanf("%d", &burst_time[i]);
    }

    sortByBurstTime(processes, burst_time, n); // Sort processes by burst time for SJF

    findAverageTime(processes, n, burst_time); // Calculate and display average waiting time and turnaround time

    return 0;
}
