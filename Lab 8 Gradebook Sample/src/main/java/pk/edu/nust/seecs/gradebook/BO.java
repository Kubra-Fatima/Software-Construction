package pk.edu.nust.seecs.gradebook;

import pk.edu.nust.seecs.gradebook.dao.*;
import pk.edu.nust.seecs.gradebook.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hp-pc on 4/26/2017.
 */
public class BO {
    public void CloBO(Clo clo)
    {
        CloDao clod=new CloDao();
        clod.addClo(clo);

    }
    public List<Clo> getClo(){
        CloDao clod=new CloDao();
        List<Clo> clos = new ArrayList<Clo>();
        clos=clod.getAllClos();
        return clos;
    }
    public void ContentBO(Content cn){
        ContentDao cnd=new ContentDao();
        cnd.addContent(cn);
    }
    public void CourseBO(Course cn){
        CourseDao cnd=new CourseDao();
        cnd.addCourse(cn);
    }
    public void GradeBO(Grade cn){
        GradeDao cnd=new GradeDao();
        cnd.addGrade(cn);
    }
    public void StudentBO(Student cn){
       StudentDao cnd=new StudentDao();
        cnd.addStudent(cn);
    }
    public void TeacherBO(Teacher cn){
        TeacherDao cnd=new TeacherDao();
        cnd.addTeacher(cn);
    }




}
