package apptive.study.service;

import apptive.study.domain.Product;
import apptive.study.dto.MemberRequest;
import apptive.study.repository.MemberRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 회원가입
     */
    public Long join(MemberRequest memberRequest) {
        Product product = new Product();
        product.setName(memberRequest.name());
        product.setPrice(memberRequest.price());
        product.setAmount(memberRequest.amount());

        validateDuplicateMember(product);
        memberRepository.save(product);
        return product.getId();
    }

    private void validateDuplicateMember(Product product) {
        memberRepository.findByName(product.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /**
     * 전체 회원 조회
     */
    public List<Product> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Product> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}