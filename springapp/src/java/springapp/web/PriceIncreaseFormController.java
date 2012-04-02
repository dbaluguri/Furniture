package springapp.web; 
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest; 
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory; 
import springapp.service.LoginInfo;
import springapp.service.ProductManager;
import springapp.service.PriceIncrease; 

public class PriceIncreaseFormController extends SimpleFormController { 

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass()); 
    private ProductManager productManager; 
    
    @Override
    public ModelAndView onSubmit(Object command)
            throws ServletException { 
        
//        int increase = ((PriceIncrease) command).getPercentage();
//        logger.info("Increasing prices by " + increase + "%."); 
//        productManager.increasePrice(increase); 
//        logger.info("returning from PriceIncreaseForm view to " + getSuccessView()); 
        return new ModelAndView(new RedirectView(getSuccessView()));
    } 
    
    @Override
    protected Object formBackingObject(HttpServletRequest request) throws ServletException {
        LoginInfo info = new LoginInfo();
        info.setUserName("email");
        info.setPassword("password");
//        PriceIncrease priceIncrease = new PriceIncrease();
//        priceIncrease.setPercentage(20);
//        return priceIncrease;
        return info;
    } 
    
    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    } 
    
    public ProductManager getProductManager() {
        return productManager;
    } 
}