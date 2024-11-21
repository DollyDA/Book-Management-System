@Configuration
public class ThymeleafConfig {

    @Bean
    public SpringTemplateEngine templateEngine(TemplateResolver templateResolver) {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

    @Bean
    public TemplateResolver templateResolver() {
        TemplateResolver templateResolver = new TemplateResolver();
        templateResolver.setPrefix("classpath:/templates/");  // Ensure it's looking at the correct directory
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(false);  // Disable cache in dev mode
        return templateResolver;
    }
}
