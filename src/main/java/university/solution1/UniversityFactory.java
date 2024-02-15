package university.solution1;

public interface UniversityFactory {
    Course createCourse();
    Professor createProfessor();
    Schedule createSchedule();
    Syllabus createSyllabus();
}
