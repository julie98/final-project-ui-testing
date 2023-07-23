package constants;
import utils.ApplicationProperties;

public enum URL {
    Login("/login.jsp"),
    Dashboard("/secure/Dashboard.jspa"),
    UserManage("/secure/admin/user/UserBrowser.jspa"),
    ViewUser("/secure/admin/user/ViewUser.jspa"),
    ProjectRole("/secure/project/ViewProjectRoles.jspa"),
    ViewPermissionSchema("/secure/admin/ViewPermissionSchemes.jspa"),
    EditPermissionSchema("/secure/admin/EditPermissions!default.jspa"),
    GroupBrowser("/secure/admin/user/GroupBrowser.jspa");

    private final String url;
    URL(String path) {
        this.url = ApplicationProperties.get("baseUrl") + path;
    }

    @Override
    public String toString() {
        return url;
    }
}
