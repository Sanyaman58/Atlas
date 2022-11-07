package Pages;

import Pages.admin.*;
import Utils.AllureLogger;

public class Pages extends AllureLogger {
    private static LoginPage loginPage;
    private static NewResearchPage newResearchPage;
    private static JurisdictionPage jurisdictionPage;
    private static QuestionnairePage questionnairePage;
    private static SaveSubmitJobPage saveSubmitJobPage;
    private static ViewResultsPage viewResultsPage;

    //                              Admin                                   //
    private static LoginAdminPage loginAdminPage;
    private static ResearchAdminPage researchAdminPage;
    private static RequirementsAdminPage requirementsAdminPage;
    private static QuestionnaireAdminPage questionnaireAdminPage;
    private static EndsUpInStatesAdminPage endsUpInStatesAdminPage;

    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public static NewResearchPage newResearchPage() {
        if (newResearchPage == null) {
            newResearchPage = new NewResearchPage();
        }
        return newResearchPage;
    }

    public static JurisdictionPage jurisdictionPage() {
        if (jurisdictionPage == null) {
            jurisdictionPage = new JurisdictionPage();
        }
        return jurisdictionPage;
    }

    public static QuestionnairePage questionnairePage() {
        if (questionnairePage == null) {
            questionnairePage = new QuestionnairePage();
        }
        return questionnairePage;
    }

    public static SaveSubmitJobPage saveSubmitJobPage() {
        if (saveSubmitJobPage == null) {
            saveSubmitJobPage = new SaveSubmitJobPage();
        }
        return saveSubmitJobPage;
    }

    public static ViewResultsPage viewResultsPage() {
        if (viewResultsPage == null) {
            viewResultsPage = new ViewResultsPage();
        }
        return viewResultsPage;
    }

    public static LoginAdminPage loginAdminPage() {
        if (loginAdminPage == null) {
            loginAdminPage = new LoginAdminPage();
        }
        return loginAdminPage;
    }

    public static ResearchAdminPage researchAdminPage() {
        if (researchAdminPage == null) {
            researchAdminPage = new ResearchAdminPage();
        }
        return researchAdminPage;
    }

    public static RequirementsAdminPage requirementsAdminPage() {
        if (requirementsAdminPage == null) {
            requirementsAdminPage = new RequirementsAdminPage();
        }
        return requirementsAdminPage;
    }

    public static QuestionnaireAdminPage questionnaireAdminPage() {
        if (questionnaireAdminPage == null) {
            questionnaireAdminPage = new QuestionnaireAdminPage();
        }
        return questionnaireAdminPage;
    }

    public static EndsUpInStatesAdminPage endsUpInStatesAdminPage() {
        if (endsUpInStatesAdminPage == null) {
            endsUpInStatesAdminPage = new EndsUpInStatesAdminPage();
        }
        return endsUpInStatesAdminPage;
    }

}
