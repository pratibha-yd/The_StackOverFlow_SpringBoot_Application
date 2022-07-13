package pratibha.knoldus.springbootclone.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pratibha.knoldus.springbootclone.service.impl.account.AccountSortType;
import pratibha.knoldus.springbootclone.domain.Account;

public interface AccountSortService {

    Page<Account> sort(Pageable pageable);

    boolean isSuitableFor(AccountSortType sortType);

}
