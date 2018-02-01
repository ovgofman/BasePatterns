package basePatterns.creational.prototype;

/**
 * Created by hofa on 01.02.2018.
 */
public class Project implements Copyable {
    private int id;
    private String projectName;
    private String sourceCode;

    public Project(int id, String name, String sourceCode) {
        this.id = id;
        this.projectName = name;
        this.sourceCode = sourceCode;
    }

    public int getId() {
        return id;
    }

    public Project setId(int id) {
        this.id = id;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public Project setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
