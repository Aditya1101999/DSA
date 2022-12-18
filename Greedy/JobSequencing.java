package DSA.Greedy;
import java.util.*;
public class JobSequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args){
        int[][] jobsInfo={{4,20},{1,10},{1,40},{1,40}} ;
        System.out.println("maximum profit seq is ");
        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i< jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        //descending order of profit
        Collections.sort(jobs,(a,b)->b.profit-a.profit);
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.print("max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }

}
