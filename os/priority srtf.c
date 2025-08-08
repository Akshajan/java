#include <stdio.h>

void findWaitingTime(int processes[], int n, int bt[], int wt[], int at[], int pr[]) {
    int rt[n]; // Remaining time for each process
    for (int i = 0; i < n; i++) {
        rt[i] = bt[i]; // Initialize remaining times with burst times
    }

    int completed = 0, t = 0; // t is the current time
    int highest_priority, selected_process, check;

    while (completed != n) {
        highest_priority = -1;
        selected_process = -1;
        check = 0;

        // Find the process with the highest priority (lowest priority value = higher priority)
        for (int i = 0; i < n; i++) {
            if (at[i] <= t && rt[i] > 0 && (highest_priority == -1 || pr[i] < highest_priority)) {
                highest_priority = pr[i];
                selected_process = i;
                check = 1;
            }
        }

        // If no process is found, increment time and continue
        if (check == 0) {
            t++;
            continue;
        }

        // Execute the selected process for 1 unit of time
        rt[selected_process]--;

        // If the process finishes, calculate its waiting time
        if (rt[selected_process] == 0) {
            completed++;
            int finish_time = t + 1;
            wt[selected_process] = finish_time - at[selected_process] - bt[selected_process];
            if (wt[selected_process] < 0) {
                wt[selected_process] = 0; // Avoid negative waiting time
            }
        }

        t++; // Increment time
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    // Turnaround time = Burst time + Waiting time
    for (int i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
    }
}

void findAverageTime(int processes[], int n, int bt[], int at[], int pr[]) {
    int wt[n], tat[n];
    int total_wt = 0, total_tat = 0;

    // Find waiting time for each process
    findWaitingTime(processes, n, bt, wt, at, pr);

    // Find turnaround time for each process
    findTurnAroundTime(processes, n, bt, wt, tat);

    // Calculate total waiting time and total turnaround time
    for (int i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
    }

    // Print results
    printf("Process\tBurst Time\tArrival Time\tPriority\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i], bt[i], at[i], pr[i], wt[i], tat[i]);
    }

    printf("\nAverage waiting time: %.2f\n", (float)total_wt / n);
    printf("Average turnaround time: %.2f\n", (float)total_tat / n);
}

int main() {
    int n;

    // Number of processes
    printf("Enter number of processes: ");
    scanf("%d", &n);

    int processes[n], burst_time[n], arrival_time[n], priority[n];

    // Process IDs (we assume processes are labeled 1, 2, 3, ...)
    printf("Enter burst times, arrival times, and priorities for each process: \n");
    for (int i = 0; i < n; i++) {
        processes[i] = i + 1; // Process ID (1, 2, 3, ...)
        printf("Burst time for process %d: ", processes[i]);
        scanf("%d", &burst_time[i]);
        printf("Arrival time for process %d: ", processes[i]);
        scanf("%d", &arrival_time[i]);
        printf("Priority for process %d: ", processes[i]);
        scanf("%d", &priority[i]);
    }

    // Calculate and display average waiting time and turnaround time
    findAverageTime(processes, n, burst_time, arrival_time, priority);

    return 0;
}
