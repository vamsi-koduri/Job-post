//package com.vamsi.JobApp.Repo;
//
//import com.vamsi.JobApp.model.JobPost;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class JobRepo {
//    List<JobPost> jobs= new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//                    3, List.of("HTML", "CSS", "JavaScript", "React")))
//            ));
//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//    public void  addJob(JobPost job){
//        jobs.add(job);
//    }
//}



package com.vamsi.springdatarestdemo.repo;

import com.vamsi.springdatarestdemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}
