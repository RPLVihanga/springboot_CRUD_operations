package com.ictec.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectService {
    @Autowired
    private ProjectRepository proRep;

    public Iterable<Project> getAllProjects(){
        return proRep.findAll();
    }

    public void  saveProject(Project p){
        proRep.save(p);
    }

    public Project getProjectByID(Long id){
        return proRep.findById(id).get();
    }

    public void deleteProjectByID(Long id){
        proRep.deleteById(id);
    }
}
