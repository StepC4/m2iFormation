package serenity.StepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Quand;
import io.cucumber.java.fr.Soit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class MyStepdefs extends PageObject {
    @FindBy(id = "userName")
    WebElementFacade champUsername;
    @FindBy(id = "password")
    WebElementFacade champPassword;
    @FindBy(id = "login")
    WebElementFacade loginButton;
    @FindBy(id = "name")
    WebElementFacade errorMessage;
    @FindBy(id = "newUser")
    WebElementFacade newUserButton;
    @FindBy(id = "userForm")
    WebElementFacade newUserForm;
    @FindBy(id = "firstname")
    WebElementFacade firstname;
    @FindBy(id = "lastname")
    WebElementFacade lastname;
    @FindBy(id = "register")
    WebElementFacade register;
    @FindBy(id = "item-0")
    WebElementFacade BSAmenuLogin;
    @FindBy(xpath = "//*[contains(@class, \"card\")][6]")
    WebElementFacade BSAmenu;
    @FindBy(xpath = "//*[@class=\"selenium-button-container\"][1]/a")
    WebElementFacade SWDReadMore;
    @FindBy(xpath = "//h1")
    WebElementFacade title;
    @FindBy(id = "m-documentationwebdrivergetting_started")
    WebElementFacade GettingStartedButton;
    @FindBy(xpath = "//*[@id=\"main_navbar\"]//span[contains(text(), \"Downloads\")]")
    WebElementFacade navDownloads;


    @Soit("un étudiant sur le site {string}")
    public void unÉtudiantSurLeSite(String url) {
        openAt(url);
    }

    @Quand("il saisit son userName {string}")
    public void ilSaisitSonUserName(String username) {
        champUsername.sendKeys(username);
    }

    @Et("il saisit son password {string}")
    public void ilSaisitSonPassword(String password) {
        champPassword.sendKeys(password);
    }

    @Et("il clique sur le bouton login")
    public void ilCliqueSurLeBoutonLogin() {
        loginButton.click();
    }

    @Alors("le message d'erreur {string} apparait en rouge")
    public void leMessageDErreurApparaitEnRouge(String arg0) {
        Assert.assertEquals(errorMessage.getText(), arg0);
    }

    @Quand("il click sur ne user")
    public void ilClickSurNeUser() {
        newUserButton.click();
    }

    @Alors("il arrive sur la page de formulaire de création de compte")
    public void ilArriveSurLaPageDeFormulaireDeCréationDeCompte() {
        newUserForm.isVisible();
    }

    @Quand("il saisit son prénom {string}")
    public void ilSaisitSonPrénom(String arg0) {
        firstname.sendKeys(arg0);
    }

    @Et("il saisit son nom {string}")
    public void ilSaisitSonNom(String arg0) {
        lastname.sendKeys(arg0);
    }

    @Et("il saisit son username {string}")
    public void ilSaisitSonUsername(String arg0) {
        champUsername.sendKeys(arg0);
    }

    @Et("clique sur le bouton register")
    public void cliqueSurLeBoutonRegister() {
        register.click();
    }

    @Given("An user on the selenium website {string}")
    public void anUserOnTheSeleniumWebsite(String arg0) {
        openAt(arg0);
    }

    @When("he click on the driver button")
    public void heClickOnTheDriverButton() {
        SWDReadMore.click();
    }

    @Then("hen arrice on the webdriver page")
    public void henArriceOnTheWebdriverPage() {
        Assert.assertEquals(title.getText(), "WebDriver");
    }

    @When("he click on tje getting started link")
    public void heClickOnTjeGettingStartedLink() {
        GettingStartedButton.click();
    }

    @Then("he arrive on tje getting started page")
    public void heArriveOnTjeGettingStartedPage() {
        Assert.assertEquals(title.getText(), "Getting started");
    }

    @When("he click on the download nav link")
    public void heClickOnTheDownloadNavLink() {
        navDownloads.click();
    }

    @Then("he arrive on the download page")
    public void heArriveOnTheDownloadPage() {
        Assert.assertEquals(title.getText(), "Downloads");
    }

    @And("he verifies the content title is equal to {string}")
    public void heVerifiesTheContentTitleIsEqualTo(String arg0) {
        Assert.assertEquals(title.getText(), arg0);
    }
}
