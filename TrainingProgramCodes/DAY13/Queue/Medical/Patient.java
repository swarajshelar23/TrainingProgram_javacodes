package DAY13.Queue.Medical;

public class Patient implements Comparable<Patient> {
    private int id;
    private String name;
    private int age;
    private String disease;

    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public void setDisease(String disease) {
        this.disease = disease;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Patient other = (Patient) obj;
        if (id != other.id)
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                '}';
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(this.id, other.id);
    }
}