package university.solution3;

public class Client {
    public Client(FactoryForUniversityA factoryA) {
        Course course = factoryA.createCourse("Programming");
        course.checkCourse();

        Professor professor = factoryA.createProfessor("Joseph");
        professor.checkProfessor();

        Schedule schedule = factoryA.createSchedule("Monday, Wednesday, Friday");
        schedule.checkSchedule();

        Syllabus syllabus = factoryA.createSyllabus("Microsoft program");
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
    }
}
