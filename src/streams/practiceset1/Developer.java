package streams.practiceset1;

import java.util.List;

class Developer {
    String name;
    List<String> skills;

    Developer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }
}
