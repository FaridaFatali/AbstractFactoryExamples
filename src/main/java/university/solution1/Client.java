package university.solution1;

public class Client {
    public Client(UniversityFactory factory){
        Course course = factory.createCourse();
        course.checkCourse();

        Professor professor = factory.createProfessor();
        professor.checkProfessor();

        Schedule schedule = factory.createSchedule();
        schedule.checkSchedule();

        Syllabus syllabus = factory.createSyllabus();
        syllabus.checkSyllabus();
    }
}
