package university.solution3;

public class AUniversityFactory implements FactoryForUniversityA{
    @Override
    public Course createCourse(String name) {
        return new Course();
    }

    @Override
    public Professor createProfessor(String name) {
        return new Professor();
    }

    @Override
    public Schedule createSchedule(String name) {
        return new Schedule();
    }

    @Override
    public Syllabus createSyllabus(String name) {
        return new Syllabus();
    }
}
