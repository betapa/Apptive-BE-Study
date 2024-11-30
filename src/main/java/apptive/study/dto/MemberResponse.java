package apptive.study.dto;

import apptive.study.domain.Product;

public record MemberResponse(
        Long id,
        String name,
        int price,
        int amount
) {

    public static MemberResponse from(Product product){
        return new MemberResponse(product.getId(), product.getName(), product.getPrice(), product.getAmount());
    }
}
