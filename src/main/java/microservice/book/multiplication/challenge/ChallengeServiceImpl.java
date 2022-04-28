package microservice.book.multiplication.challenge;

import microservice.book.multiplication.user.User;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class ChallengeServiceImpl implements ChallengeService{
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO attemptDTO) {
        // check if the attempt is correct
        boolean isCorrect = attemptDTO.getGuess() ==
                attemptDTO.getFactorA() * attemptDTO.getFactorB();
        // We don't use identifier for now
        User user = new User(null, attemptDTO.getUserAlis());
        // build domain object, null id for now
        ChallengeAttempt checkAttempt = new ChallengeAttempt(
                null,
                user,
                attemptDTO.getFactorA(),
                attemptDTO.getFactorB(),
                attemptDTO.getGuess(),
                isCorrect);
        return checkAttempt;
    }
}
