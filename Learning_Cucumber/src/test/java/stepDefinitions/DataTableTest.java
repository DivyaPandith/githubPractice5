package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class DataTableTest {
	@Given("values in data table to be printed")
	public void values_in_data_table_to_be_printed(DataTable dataTable) {
		List<List<String>> table = dataTable.asLists();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(table.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
