package task5;

import java.util.*;



public class CPUScheduler {
	
//	 declare a queue that will hold the objects of type job_sch
    private Queue<job_sch> Job_queues;

    public CPUScheduler() {
    	
//    	give the queue a linked list type
        Job_queues = new LinkedList<>();
    }
    
//     a function to add a new job to Job_queues

    public void add(job_sch x) {
        Job_queues.add(x);
    }
    
//     a function to run the jobs

    public void running() {
    	
//    this is a while loop that loops if the linkedlist is not empty 
        while (!Job_queues.isEmpty()) {
        	
//        	Assign the next job to job_sch object x by polling the Job_queues 
            job_sch x = Job_queues.poll();
            
//            this is to print the job that is currently running using the getid function
            System.out.println(" the running job is : " + x.Get_id());
            
//		 Pause the thread for the duration of the job

            try {
                Thread.sleep(x.Get_Dur() * 1100);
            } catch (InterruptedException m) {
                m.printStackTrace();
            }
        }
    }
    
    
//   this is the main function and it uses the add function to add new jobs
//    and then calls the run function on all schedule

    public static void main(String[] args) {
        CPUScheduler Sched = new CPUScheduler();
        Sched.add(new job_sch(1, 0));
        Sched.add(new job_sch(2, 3));
        Sched.add(new job_sch(3, 3));
        Sched.add(new job_sch(4, 3));
        Sched.running();
    }
}

class job_sch {
	
//	private variables
    private int ID,p,dur;
   
    
//    constructors
    
//     public Main(int year, String name) {
//    modelYear = year;
//    modelName = name;
//  }

    public job_sch(int ID, int dur) {
    	this.dur = dur;
        this.ID = ID;
        this.p = (int) (Math.random() * 20) + 1;
        
    }
    
//    getters for all the private variables
    
    public int Get_Prior() {
        return p;
    }

    
    public int Get_Dur() {
        return dur;
    }

    public int Get_id() {
        return ID;
    }

   
  

	public int Get_arr_time() {
		
		return 0;
	}
}