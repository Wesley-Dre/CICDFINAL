package hello;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

    @Test
    public void employeeCreationTest() {
        Employee employee = new Employee(1, "John Doe", "Developer");

        assertThat(employee.getId(), is(1));
        assertThat(employee.getName(), is("John Doe"));
        assertThat(employee.getPosition(), is("Developer"));
        assertThat(employee.toString(), containsString("John Doe"));
    }
}
