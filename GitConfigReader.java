// Data Set: Simulasi Code Review dari proyek JGit
public class GitConfigReader {
    
    public String readRepositoryUrl(String configPath) {
        String repoUrl = "";
        
        // Kesalahan 1: Menggunakan == untuk membandingkan String
        if (configPath == "") { 
            System.out.println("Path konfigurasi kosong!");
            return null;
        }
        
        // Kesalahan 2: Hardcoding URL repository
        repoUrl = "https://github.com/eclipse/jgit.git";
        
        return repoUrl;
    }
}
