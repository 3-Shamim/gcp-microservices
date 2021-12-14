package com.learningstuff.userservice.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

import static com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৪/১২/২১
 * Time: ১১:৪৮ AM
 * Email: mdshamim723@gmail.com
 */

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "users")
public class User {

    private static final long serialVersionUID = 8795189746123863549L;

    @Id
    @GeneratedValue(generator = "native", strategy = GenerationType.SEQUENCE)
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @Column(unique = true)
    @Email(message = "Must be a valid email")
    @Size(min = 1, max = 255, message = "Email must be between {min} to {max}")
    private String email;

    @NotNull(message = "Full name must not be null")
    @Size(min = 1, max = 100, message = "Full name must be between {min} to {max}")
    @Column(nullable = false, length = 100)
    private String fullName;

    @Size(min = 1, max = 25, message = "Primary number must be between {min} to {max}")
    @Column(unique = true, length = 25)
    private String primaryNumber;

    @JsonProperty(access = READ_ONLY)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime createdAt;

    @JsonProperty(access = READ_ONLY)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }

}
