package design.pattern.chapter9;

/**
 * .
 * When I wrote this, only God and I understood what I was doing
 * Now, God only knows
 *
 * @author RichardLee
 * @version v1.0
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    public Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        work.setWorkDate(timeArea);
        work.setCompany(company);
    }

    public void display() {
        System.out.printf("%s %s %s", name, sex, age);
        System.out.println();
        System.out.printf("工作经历: %s %s", work.getWorkDate(), work.getCompany());
        System.out.println();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
