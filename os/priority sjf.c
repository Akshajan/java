#include <stdio.h>

void findWaitingTime(int processes[], int n, int bt[], int wt[], int pr[]) {
    wt[0] = 0;  // The waiting time for the first process is always 0

    // Calculate waiting time for each process
    for (int i = 1; i < n; i++) {
        wt[i] = bt[i - 1] + wt[i - 1];  // waiting time is sum of previous burst times
    }
}

void findTurnAroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    // Turnaround time is the sum of burst time and waiting time
    for (int i = 0; i < n; i++) {
        tat[i] = bt[i] + wt[i];
    }
}

void findAverageTime(int processes[], int n, int bt[], int pr[]) {
    int wt[n], tat[n];
    int total_wt = 0, total_tat = 0;

    // Find waiting time for each process
    findWaitingTime(processes, n, bt, wt, pr);

    // Find turnaround time for each process
    findTurnAroundTime(processes, n, bt, wt, tat);

    // Calculate total waiting time and total turnaround time
    for (int i = 0; i < n; i++) {
        total_wt += wt[i];
        total_tat += tat[i];
    }

    // Print results
    printf("Process\tBurst Time\tPriority\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", processes[i], bt[i], pr[i], wt[i], tat[i]);
    }

    printf("\nAverage waiting time: %.2f\n", (float)total_wt / n);
    printf("Average turnaround time: %.2f\n", (float)total_tat / n);
}

void sortByPriorityAndBurstTime(int processes[], int bt[], int pr[], int n) {
    int temp, i, j;

    // Sorting the processes according to priority and burst time
    for (i = 0; i < n - 1; i++) {
        for (j = i + 1; j < n; j++) {
            // First, sort by priority (ascending), if equal then by burst time (ascending)
            if (pr[i] > pr[j] || (pr[i] == pr[j] && bt[i] > bt[j])) {
                // Swap burst times
                temp = bt[i];
                bt[i] = bt[j];
                bt[j] = temp;

                // Swap corresponding process IDs
                temp = processes[i];
                processes[i] = processes[j];
                processes[j] = temp;

                // Swap priorities
                temp = pr[i];
                pr[i] = pr[j];
                pr[j] = temp;
            }
        }
    }
}

int main() {
    int n;

    // Number of processes
    printf("Enter number of processes: ");
    scanf("%d", &n);

    int processes[n], burst_time[n], priority[n];

    // Process IDs (we assume processes are labeled 1, 2, 3, ...)
    printf("Enter burst times and priorities for each process: \n");
    for (int i = 0; i < n; i++) {
        processes[i] = i + 1;  // Process ID (1, 2, 3, ...)
        printf("Burst time for process %d: ", processes[i]);
        scanf("%d", &burst_time[i]);
        printf("Priority for process %d: ", processes[i]);
        scanf("%d", &priority[i]);
    }

    // Sort processes by priority and burst time for Priority Scheduling
    sortByPriorityAndBurstTime(processes, burst_time, priority, n);

    // Calculate and display average waiting time and turnaround time
    findAverageTime(processes, n, burst_time, priority);

    return 0;
}
