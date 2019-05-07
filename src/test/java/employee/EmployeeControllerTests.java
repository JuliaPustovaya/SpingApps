package employee;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.websystique.springmvc.controller.AppControllerJSON;

//@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(AppControllerJSON.class)
public class EmployeeControllerTests {    /*
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
*/
}
