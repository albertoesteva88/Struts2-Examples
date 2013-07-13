//package actions;
//
//import java.util.Collection;
//
//import org.apache.struts2.rest.DefaultHttpHeaders;
//import org.apache.struts2.rest.HttpHeaders;
//import org.apache.struts2.convention.annotation.Results;
//import org.apache.struts2.convention.annotation.Result;
//
//import com.opensymphony.xwork2.ModelDriven;
//import com.opensymphony.xwork2.Validateable;
//import com.opensymphony.xwork2.ValidationAwareSupport;
//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.interceptor.validation.SkipValidation;
//
//@Results({
//    @Result(name = "success", type = "redirectAction", params = {"actionName", "orders"})
////    ,
////    @Result(name = "orders-show", type = "dispatcher", params = {"location", "orders-index.jsp"}
////    )
//})
//public class OrdersController extends ValidationAwareSupport implements ModelDriven<Object>, Validateable {
//
//    private Order model = new Order();
//    private String id;
//    private Collection<Order> list;
//    private OrdersService ordersService = new OrdersService();
//
////    @Action(value="orders")
//    @SkipValidation
//    public String execute() {
//        System.out.println("I M executed");
//        return "index";
////        return "success";
//    }
//
//    // GET /orders/1
//    public HttpHeaders show() {
//        return new DefaultHttpHeaders("show");
//    }
//
//    // GET /orders
//    public HttpHeaders index() {
//        list = ordersService.getAll();
//        return new DefaultHttpHeaders("index").disableCaching();
//    }
//
//    // GET /orders/1/edit
//    public String edit() {
//        return "edit";
//    }
//
//    // GET /orders/new
//    public String editNew() {
//        model = new Order();
//        return "editNew";
//    }
//
//    // GET /orders/1/deleteConfirm
//    public String deleteConfirm() {
//        return "deleteConfirm";
//    }
//
//    // DELETE /orders/1
//    public String destroy() {
//        ordersService.remove(id);
//        addActionMessage("Order removed successfully");
//        return "success";
//    }
//
//    // POST /orders
//    public HttpHeaders create() {
//        ordersService.save(model);
//        addActionMessage("New order created successfully");
//        return new DefaultHttpHeaders("success").setLocationId(model.getId());
//    }
//
//    // PUT /orders/1
//    public String update() {
//        ordersService.save(model);
//        addActionMessage("Order updated successfully");
//        return "success";
//    }
//
//    public void validate() {
//        if (model.getClientName() == null || model.getClientName().length() == 0) {
//            addFieldError("clientName", "The client name is empty");
//        }
//    }
//
//    public void setId(String id) {
//        if (id != null) {
//            this.model = ordersService.get(id);
//        }
//        this.id = id;
//    }
//
//    public Object getModel() {
//        return (list != null ? list : model);
//    }
//}
