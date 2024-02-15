package university.solution2;

public class Client {
    public Client(FactoryForUniversityA factoryA) {
        Course course = factoryA.createCourse();
        course.checkCourse();

        Professor professor = factoryA.createProfessor();
        professor.checkProfessor();

        Schedule schedule = factoryA.createSchedule();
        schedule.checkSchedule();

        Syllabus syllabus = factoryA.createSyllabus();
        syllabus.checkSyllabus();
    }

    public Client(FactoryForUniversityB factoryB) {
        Course course = factoryB.createCourse();
        course.checkCourse();

        Professor professor = factoryB.createProfessor();
        professor.checkProfessor();

        Schedule schedule = factoryB.createSchedule();
        schedule.checkSchedule();

        Syllabus syllabus = factoryB.createSyllabus();
        syllabus.checkSyllabus();

        VirtualClassroom virtualClassroom = factoryB.createVirtualClassroom();
        virtualClassroom.checkVirtualClassroom();
    }
}
