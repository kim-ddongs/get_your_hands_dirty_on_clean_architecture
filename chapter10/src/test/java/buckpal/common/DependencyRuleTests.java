package buckpal.common;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class DependencyRuleTests {
    @Test
    void domainLayerDoesNotDependOnApplicationLayer() {
        noClasses()
                .that()
                .resideInAPackage("buckpal.domain..")
                .should()
                .dependOnClassesThat()
                .resideInAnyPackage("buckpal.application..")
                .check(new ClassFileImporter()
                    .importPackages("buckpal.."));
    }

    @Test
    void validateRegistrationContextArchitecture() {
        HexagonalArchitecture.boundedContext("account")
                .withDomainLayer("domain")
                .withAdaptersLayer("adapter")
                .incoming("web")
                .outgoing("persistence")
                .and()
            .withApplicationLayer("application")
                .service("service")
                .incomingPorts("port.in")
                .outgoingPorts("port.out")
                .and()
            .withConfiguration("configuration")
            .check(new ClassFileImporter()
                .importPackages("buckpal.."));
    }
}
