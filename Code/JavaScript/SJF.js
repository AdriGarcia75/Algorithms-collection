function SJF(jobs, index){
    let output = 0;
  
    while (jobs[index] > 0){
        let min = null;
        let lowestIndex = 0;
      
        for (let i = 0; i < jobs.length; i++){
            if (jobs[i] != 0 && (min == null || jobs[i] < min)){
                min = jobs[i];
                lowestIndex = i; //save the index to once getting the lowest that is not 0, "finish" the task and equal the value to 0
            }
        }
      
        output += jobs[lowestIndex]; //count the job cycles 
        jobs[lowestIndex] = 0; //as said earlier, "finish the job"
    }
  
    return output;
}