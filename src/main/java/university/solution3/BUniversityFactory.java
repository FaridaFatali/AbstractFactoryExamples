package university.solution3;

public class BUniversityFactory implements FactoryForUniversityB{
    @Override
    public Course createCourse() {
        return new Course();
    }

    @Override
    public Professor createProfessor() {
        return new Professor();
    }

    @Override
    public Schedule createSchedule() {
        return new Schedule();
    }

    @Override
    public Syllabus createSyllabus() {
        return new Syllabus();
    }
}
