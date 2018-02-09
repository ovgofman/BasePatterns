package basePatterns.behavioral.iterator;

/**
 * Created by hofa on 09.02.2018.
 */
public class JavaDeveloper implements Collection {
    private String name;
    private String[] skills;

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public JavaDeveloper setName(String name) {
        this.name = name;
        return this;
    }

    public String[] getSkills() {
        return skills;
    }

    public JavaDeveloper setSkills(String[] skills) {
        this.skills = skills;
        return this;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            } else
                return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
