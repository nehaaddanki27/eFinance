





public class Controller 
{
    @GetMapping(value="")
    public String hello(ModelMap Model) {
        return "list";
    }
}
