package 注解;
@DBTable(name = "User")
public class Member {
    @SQLString(30) String firstName;
    @SQLString(30) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30,CONSTRAINTS = @Constraints(primaryKey = true)) String reference;
    static  int memberCount;
    public String getReference() { return reference; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    @Override
    public String toString() { return reference; }
    public Integer getAge() { return age; }
}
