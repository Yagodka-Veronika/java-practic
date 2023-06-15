package Lesson2;
import java.util.logging.*;
import java.io.File;
public class test1 {
//        public static void main(String[] args) {
//            var s = System.currentTimeMillis();
//            //String str = "";
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < 1_000_000; i++) {
//                //str += "+";
//                sb.append("+");
//            }
//            System.out.println(System.currentTimeMillis() - s);
//            //System.out.println(str);
//            //System.out.println(sb);
//        }
//    }


//        public static void main(String[] args) {
//            String[] name = { "C", "е", "р", "г", "е", "й" };
//            String sk = "СЕРГЕЙ КА.";
//            System.out.println(sk.toLowerCase()); // сергей ка.
//            System.out.println(String.join("", name)); // Cергей
//            System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//            // C,е,р,г,е,й
//            System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//        }
//    }





//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathFile = pathProject.concat("/file.txt");
//        File f3 = new File(pathFile);
//        System.out.println(f3.getAbsolutePath ());
//        // /Users/sk/vscode/java_projects/file.txt
//        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//    }
//}




//        public static void main(String[] args) {
//            try {
//                String pathProject = System.getProperty("user.dir");
//                String pathFile = pathProject.concat("/file.txt");
//                File f3 = new File(pathFile);
//                System.out.println("try");
//            } catch (Exception e) {
//                System.out.println("catch");
//            }
//            finally
//            { System.out.println("finally"); }
//        }
//    }




//        public static void main(String[] args) {
//            String pathProject = System.getProperty("user.dir");
//            String pathDir = pathProject.concat("/files");
//            File dir = new File(pathDir);
//            System.out.println(dir.getAbsolutePath ());
//            if (dir.mkdir()) {
//                System.out.println("+");
//            } else {
//                System.out.println("-");
//            }
//            for (String fname : dir.list()) {
//                System.out.println(fname);
//            }
//        }
//    }




        public static void main(String[] args) {
            Logger logger = Logger.getLogger(test1.class.getName());
            logger.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            logger.addHandler(ch);
            //SimpleFormatter sFormat = new SimpleFormatter();
            XMLFormatter xml = new XMLFormatter();
            //ch.setFormatter(sFormat);
            ch.setFormatter(xml);
            logger.log(Level.WARNING, "Тестовое логирование");
            logger.info("Тестовое логирование");
        }
    }

