package university.solution2;

public class AUniversityFactory implements FactoryForUniversityA{
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
