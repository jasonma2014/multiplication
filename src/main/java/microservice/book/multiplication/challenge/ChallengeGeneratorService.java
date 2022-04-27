package microservice.book.multiplication.challenge;

public interface ChallengeGeneratorService {
    /**
     * return a random-generated challenge with factors between 11 and 99
     */
    Challenge randomChallenge();
}
