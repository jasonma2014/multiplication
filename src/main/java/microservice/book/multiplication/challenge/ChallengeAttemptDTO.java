package microservice.book.multiplication.challenge;

import lombok.Value;

/**
 * Attempt coming from user
 */
@Value
public class ChallengeAttemptDTO {
    int factorA, factorB;
    String userAlis;
    int guess;
}
