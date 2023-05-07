package com.example.ashleyncoursescheduler.Database;

import android.app.Application;
import com.example.ashleyncoursescheduler.DAO.AssessmentDAO;
import com.example.ashleyncoursescheduler.DAO.CourseDAO;
import com.example.ashleyncoursescheduler.DAO.TermDAO;
import com.example.ashleyncoursescheduler.Entities.Assessments;
import com.example.ashleyncoursescheduler.Entities.Courses;
import com.example.ashleyncoursescheduler.Entities.Terms;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private TermDAO repTermDAO;
    private CourseDAO repCourseDAO;
    private AssessmentDAO repAssessmentsDAO;
    private List<Assessments> AllAssessmentsList;
    private List<Courses> AllCoursesList;
    private List<Terms> AllTermsList;

    private static int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application) {
        DatabaseBuilder db = DatabaseBuilder.getDatabase(application);
        repAssessmentsDAO = db.AssessmentDAO();
        repCourseDAO = db.CourseDAO();
        repTermDAO = db.TermDAO();
    }

    //Assessments
    public List<Assessments> getAllAssessmentsList() throws InterruptedException {
        databaseExecutor.execute(() -> {
            AllAssessmentsList = repAssessmentsDAO.getAllAssessment();
        });
        Thread.sleep(1000);
        return AllAssessmentsList;
    }

    public void Insert(Assessments assessments) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repAssessmentsDAO.insert(assessments);
        });
        Thread.sleep(1000);
    }

    public void Delete(Assessments assessments) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repAssessmentsDAO.delete(assessments);
        });
        Thread.sleep(1000);
    }

    public void Update(Assessments assessments) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repAssessmentsDAO.update(assessments);
        });
        Thread.sleep(1000);
    }

    //Courses
    public List<Courses> getAllCoursesList() throws InterruptedException {
        databaseExecutor.execute(() -> {
            AllCoursesList = repCourseDAO.getAllCourses();
        });
        Thread.sleep(1000);
        return AllCoursesList;
    }

    public void Insert(Courses courses) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repCourseDAO.insert(courses);
        });
        Thread.sleep(1000);
    }

    public void Delete(Courses courses) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repCourseDAO.delete(courses);
        });
        Thread.sleep(1000);
    }

    public void Update(Courses courses) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repCourseDAO.update(courses);
        });
        Thread.sleep(1000);
    }


    //Terms
    public List<Terms> getAllTermsList() throws InterruptedException {
        databaseExecutor.execute(() -> {
            AllTermsList = repTermDAO.getAllTerms();
        });
        Thread.sleep(1000);
        return AllTermsList;
    }

    public void Insert(Terms terms) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repTermDAO.insert(terms);
        });
        Thread.sleep(1000);
    }

    public void Delete(Terms terms) throws InterruptedException {
        databaseExecutor.execute(() -> {
            repTermDAO.delete(terms);
        });
        Thread.sleep(1000);
    }
}
