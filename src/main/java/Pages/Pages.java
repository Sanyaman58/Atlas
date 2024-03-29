package Pages;

import Pages.admin.*;
import Pages.atlas.AtlasDashboardManagementPage;
import Pages.atlas.DocumentRepositoryPage;
import Pages.atlas.RequirementsPage;
import Pages.atlas.TaskManagerPage;
import Utils.AllureLogger;

public class Pages extends AllureLogger {
    private static EmailVerificationPage emailVerificationPage;
    private static LoginPage loginPage;
    private static NewResearchPage newResearchPage;
    private static JurisdictionPage jurisdictionPage;
    private static QuestionnairePage questionnairePage;
    private static SaveSubmitJobPage saveSubmitJobPage;
    private static ViewResultsPage viewResultsPage;
    private static ResearchNotificationPage researchNotificationPage;

    //                              Admin                                   //
    private static LoginAdminPage loginAdminPage;
    private static ResearchAdminPage researchAdminPage;
    private static RequirementsAdminPage requirementsAdminPage;
    private static QuestionnaireAdminPage questionnaireAdminPage;
    private static EndsUpInStatesAdminPage endsUpInStatesAdminPage;
    private static ViewRequirementsAdminPage viewRequirementsAdminPage;
    private static VersionRequirementsAdminPage versionRequirementsAdminPage;
    private static EditRequirementAdminPage editRequirementAdminPage;
    private static AuditLogsAdminPage auditLogsAdminPage;
    private static ActivityLogsPage activityLogsPage;
    private static ClientMasterPage clientMasterPage;
    private static EUIVersionAdminPage euiVersionAdminPage;

    //                              Atlas                                  //
    private static AtlasDashboardManagementPage atlasDashboardManagementPage;
    private static RequirementsPage requirementsPage;
	private static DocumentRepositoryPage documentRepositoryPage;
	private static TaskManagerPage taskManagerPage;

	public static LoginPage loginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	public static EmailVerificationPage emailVerificationPage() {
		if (emailVerificationPage == null) {
			emailVerificationPage = new EmailVerificationPage();
		}
		return emailVerificationPage;
	}

	public static NewResearchPage newResearchPage() {
		if (newResearchPage == null) {
			newResearchPage = new NewResearchPage();
		}
		return newResearchPage;
	}

	// s
	public static ClientMasterPage clientMasterPage() {
		if (clientMasterPage == null) {
			clientMasterPage = new ClientMasterPage();
		}
		return clientMasterPage;
	}

	public static JurisdictionPage jurisdictionPage() {
		if (jurisdictionPage == null) {
			jurisdictionPage = new JurisdictionPage();
		}
		return jurisdictionPage;
	}
    public static ResearchNotificationPage researchNotificationPage() {
        if (researchNotificationPage == null) {
            researchNotificationPage = new ResearchNotificationPage();
        }
        return researchNotificationPage;
    }

    public static QuestionnairePage questionnairePage() {
        if (questionnairePage == null) {
            questionnairePage = new QuestionnairePage();
        }
        return questionnairePage;
    }

	// public static QuestionnairePage questionnairePage() {
	// 	if (questionnairePage == null) {
	// 		questionnairePage = new QuestionnairePage();
	// 	}
	// 	return questionnairePage;
	// }

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

	public static EditRequirementAdminPage editRequirementAdminPage() {
		if (editRequirementAdminPage == null) {
			editRequirementAdminPage = new EditRequirementAdminPage();
		}
		return editRequirementAdminPage;
	}

	public static ViewRequirementsAdminPage viewRequirementsAdminPage() {
		if (viewRequirementsAdminPage == null) {
			viewRequirementsAdminPage = new ViewRequirementsAdminPage();
		}
		return viewRequirementsAdminPage;
	}

	public static ActivityLogsPage activityLogsPage() {
		if (activityLogsPage == null) {
			activityLogsPage = new ActivityLogsPage();
		}
		return activityLogsPage;
	}

	public static EndsUpInStatesAdminPage endsUpInStatesAdminPage() {
		if (endsUpInStatesAdminPage == null) {
			endsUpInStatesAdminPage = new EndsUpInStatesAdminPage();
		}
		return endsUpInStatesAdminPage;
	}

	public static AuditLogsAdminPage auditLogsAdminPage() {
		if (auditLogsAdminPage == null) {
			auditLogsAdminPage = new AuditLogsAdminPage();
		}
		return auditLogsAdminPage;
	}

	public static AtlasDashboardManagementPage atlasDashboardManagementPage() {
		if (atlasDashboardManagementPage == null) {
			atlasDashboardManagementPage = new AtlasDashboardManagementPage();
		}
		return atlasDashboardManagementPage;
	}

	public static VersionRequirementsAdminPage versionRequirementsAdminPage() {
		if (versionRequirementsAdminPage == null) {
			versionRequirementsAdminPage = new VersionRequirementsAdminPage();
		}
		return versionRequirementsAdminPage;
	}
    public static RequirementsPage requirementsPage() {
        if (requirementsPage == null) {
            requirementsPage = new RequirementsPage();
        }
        return requirementsPage;
    }

    // public static VersionRequirementsAdminPage versionRequirementsAdminPage() {
    //     if (versionRequirementsAdminPage == null) {
    //         versionRequirementsAdminPage = new VersionRequirementsAdminPage();
    //     }
    //     return versionRequirementsAdminPage;
    // }

    public static EUIVersionAdminPage euiVersionAdminPage() {
        if (euiVersionAdminPage == null) {
            euiVersionAdminPage = new EUIVersionAdminPage();
        }
        return euiVersionAdminPage;
    }

	public static DocumentRepositoryPage documentRepositoryPage() {
		if (documentRepositoryPage == null) {
			documentRepositoryPage = new DocumentRepositoryPage();
		}
		return documentRepositoryPage;
	}

	public static TaskManagerPage taskManagerPage() {
		if (taskManagerPage == null) {
			taskManagerPage = new TaskManagerPage();
		}
		return taskManagerPage;
	}

}
