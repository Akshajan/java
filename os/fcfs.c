#include <stdio.h>
typedef struct {
    int arrival,burst,completion,wait,turnaround;
} process;
int main(){
    float totalW=0,totalT=0; 
    int n,i,j,count=0;
    printf("Enter the number of process: ");
    scanf("%d",&n);
    process pa[n],temp;
    for (i =0 ; i<n;i++){
        printf("Enter Arrival time of Process %d : ",i+1);
        scanf("%d",&pa[i].arrival);
        printf("Enter Burst time of Process %d : ",i+1);
        scanf("%d",&pa[i].burst);
    }
    for(i=0; i<n;i++){
        for(j=0; j<n-i-1;j++){
            if(pa[j].arrival>pa[j+1].arrival){
                temp=pa[j];
                pa[j]=pa[j+1];
                pa[j+1]=temp;
            }
        }
    }
    for (i =0 ; i<n;i++){
        if(count>=pa[i].arrival){
            count+=pa[i].burst;
            pa[i].completion=count;
            pa[i].turnaround=pa[i].completion - pa[i].arrival ;
            pa[i].wait=pa[i].turnaround - pa[i].burst ;
            totalT+=pa[i].turnaround;
            totalW+=pa[i].wait;
        }
        else{
            count++;
            i--;
        }
    }
    printf("arrv\tburs\tcomp\tturn\twait\n");
    for (i =0 ; i<n;i++)
        printf("%d\t%d\t%d\t%d\t%d\n",pa[i].arrival,pa[i].burst,pa[i].completion,pa[i].turnaround,pa[i].wait) ;
    printf("AvgW:\t%f\nAvgT:\t%f\n",totalW/n,totalT/n);
}