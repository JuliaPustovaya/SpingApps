package employee;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.websystique.springmvc.controller.AppControllerJSON;
import com.websystique.springmvc.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(AppControllerJSON.class)
public class EmployeeControllerTests {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private AppControllerJSON arrivalController;

	@Test
	public void getAllEmployees() throws Exception {
		Employee employee = new Employee();
		employee.setSsn("5Hty24");
		employee.setSalary(BigDecimal.valueOf(1235, 84));
		employee.setName("Vasiliy");
		employee.setJoiningDate(LocalDate.of(2019, 7, 20));
		List<Employee> allEmployees = Collections.singletonList(employee);
		given(arrivalController.listEmployees()).willReturn(allEmployees);
		mvc.perform(get("/{list}").contentType(APPLICATION_JSON)).andExpect(status().isOk()).andExpect(jsonPath("$", hasSize(1)))
				.andExpect((ResultMatcher) jsonPath("$[0].name", is(employee.getName())));
	}
}
