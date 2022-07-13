package pratibha.knoldus.springbootclone.service.impl.account;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pratibha.knoldus.springbootclone.repository.AccountRepository;
import pratibha.knoldus.springbootclone.domain.Account;
import pratibha.knoldus.springbootclone.service.AccountSortService;

@Service
@AllArgsConstructor
public class IdAccountSortService implements AccountSortService {

    private final AccountRepository accountRepository;

    @Override
    public Page<Account> sort(Pageable pageable) {
        return accountRepository.findAll(pageable);
    }

    @Override
    public boolean isSuitableFor(AccountSortType sortType) {
        return AccountSortType.ID.equals(sortType);
    }
}
