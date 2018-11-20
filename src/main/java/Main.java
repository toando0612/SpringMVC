import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import serviceandbean.bean.*;

/**
 * Created by CoT on 7/29/18.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);

        context.refresh();

        PatientServiceImpl patientServiceImpl = context.getBean(PatientServiceImpl.class);
        VisitServiceImpl visitService = context.getBean(VisitServiceImpl.class);
        PrescriptionServiceImpl prescriptionService = context.getBean(PrescriptionServiceImpl.class);
        IcdServiceImpl icdService = context.getBean(IcdServiceImpl.class);
        DrugServiceImpl drugService = context.getBean(DrugServiceImpl.class);
        DrugInfoServiceImpl drugInfoService = context.getBean(DrugInfoServiceImpl.class);



    }
}
