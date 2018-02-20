package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by Harshala on 31/01/2018.
 */

public class FirstStepDef {

    @Given("^User on x page$")
    public void user_on_x_page() throws Throwable {
        System.out.println("Given: user on x page. ....Change Done 16.26pm");
    }

    @Then("^User can see y element$")
    public void user_can_see_y_element() throws Throwable {
        System.out.println("Then: user can see y element.");
    }


}
