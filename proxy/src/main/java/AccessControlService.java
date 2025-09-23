import java.util.HashSet;
import java.util.Set;

public class AccessControlService {

    private static AccessControlService instance;
    private Set<String> permissions = new HashSet<>();


    public AccessControlService() {
        grantAccess();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess() {
        permissions.add("1:john1234");
        permissions.add("2:Pekka");
    }


    public boolean isAllowed(int documentId, User user) {
        String key = documentId + ":" + user.getUsername();
        return permissions.contains(key);
    }
}
