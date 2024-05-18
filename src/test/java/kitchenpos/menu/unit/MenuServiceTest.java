package kitchenpos.menu.unit;

import kitchenpos.application.MenuService;
import kitchenpos.domain.MenuGroupRepository;
import kitchenpos.domain.MenuRepository;
import kitchenpos.domain.ProductRepository;
import kitchenpos.infra.PurgomalumClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MenuServiceTest {

    private MenuService menuService;

    @Mock
    private MenuRepository menuRepository;
    @Mock
    private MenuGroupRepository menuGroupRepository;
    @Mock
    private ProductRepository productRepository;
    @Mock
    private PurgomalumClient purgomalumClient;

    @BeforeEach
    void setUp() {
        this.menuService = new MenuService(
                menuRepository, menuGroupRepository, productRepository, purgomalumClient
        );
    }

    @Nested
    class 등록 {

        @Test
        @DisplayName("[성공] 메뉴를 등록한다.")
        void create() {

        }

        @Nested
        class 가격검증 {

            @Test
            @DisplayName("[실패] 메뉴의 가격을 입력하지 않으면 메뉴는 등록이 되지 않는다.")
            void 메뉴_가격_null() {

            }

            @Test
            @DisplayName("[실패] 메뉴의 가격이 0원보다 낮으면 메뉴는 등록이 되지 않는다.")
            void 메뉴_가격_마이너스() {

            }

            @Test
            @DisplayName("[실패] 메뉴의 가격이 상품 목록의 가격 합계보다 높으면 메뉴는 등록이 되지 않는다.")
            void 메뉴_가격_상품_목록의_가격_합계보다_높음() {

            }

        }

        @Nested
        class 메뉴그룹등록여부검증 {

            @Test
            @DisplayName("[실패] 등록하려는 메뉴가 등록되지 않은 메뉴그룹에 포함될 경우 메뉴는 등록이 되지 않는다.")
            void 메뉴그룹_미등록() {

            }

        }

        @Nested
        class 상품목록검증 {

            @Test
            @DisplayName("[실패] 메뉴에 포함되어 있는 상품 목록이 존재하지 않으면 메뉴는 등록되지 않는다.")
            void 상품목록_null() {

            }

            @Test
            @DisplayName("[실패] 메뉴에 포함되어 있는 상품 목록이 비어있을 경우 메뉴는 등록되지 않는다.")
            void 상품목록_empty() {

            }

            @Test
            @DisplayName("[실패] 메뉴에 포함되어 있는 상품 목록 중 등록되지 않은 상품이 포함되어 있을 경우 메뉴는 등록되지 않는다.")
            void 상품목록_미등록_상품포함() {

            }

            @Test
            @DisplayName("[실패] 메뉴에 포함되어 있는 상품 목록 중 0개 미만의 수량을 가진 상품이 포함되어 있을 경우 메뉴는 등록되지 않는다.")
            void 상품목록_0개미만수량인_상품포함() {

            }

        }

        @Nested
        class 이름검증 {

            @Test
            @DisplayName("[실패] 메뉴의 이름을 입력하지 않으면 등록이 되지 않는다.")
            void 메뉴_이름_null() {

            }

            @Test
            @DisplayName("[실패] 메뉴의 이름에 부적절한 단어(욕설 등)가 포함되면 등록이 되지 않는다.")
            void 메뉴_이름_욕설() {

            }

        }

    }

    @Nested
    class 가격수정 {

        @Test
        @DisplayName("[성공] 메뉴의 가격을 수정한다.")
        void changePrice() {

        }

        @Nested
        class 가격검증 {


            @Test
            @DisplayName("[실패] 변경할 메뉴의 가격을 입력하지 않으면 메뉴 가격은 수정되지 않는다.")
            void 메뉴_가격_null() {

            }

            @Test
            @DisplayName("[실패] 변경할 메뉴의 가격이 0원보다 낮으면 메뉴 가격은 수정되지 않는다.")
            void 메뉴_가격_마이너스() {

            }

            @Test
            @DisplayName("[실패] 변경할 메뉴의 가격이 상품 목록의 가격 합계보다 높으면 메뉴는 등록이 되지 않는다.")
            void 메뉴_가격_상품_목록의_가격_합계보다_높음() {

            }
        }

        @Nested
        class 메뉴등록여부검증 {

            @Test
            @DisplayName("[실패] 등록되지않은 메뉴 아이디인 경우 메뉴 가격이 수정되지 않는다.")
            void 메뉴_미등록() {

            }

        }

    }

    @Nested
    class 숨김해제 {

        @Test
        @DisplayName("[성공] 메뉴를 숨김해제 처리를 한다.")
        void display() {

        }

        @Nested
        class 메뉴등록여부검증 {

            @Test
            @DisplayName("[실패] 등록되지않은 메뉴 아이디인 경우 메뉴를 숨김해제 처리가 되지 않는다.")
            void 메뉴_미등록() {

            }

        }

        @Nested
        class 가격검증 {

            @Test
            @DisplayName("[실패] 메뉴의 가격이 상품 목록의 가격 합계보다 높으면 메뉴는 숨김해제 처리가 되지 않는다.")
            void 메뉴_가격_상품_목록의_가격_합계보다_높음() {

            }

        }

    }

    @Nested
    class 숨김 {

        @Test
        @DisplayName("[성공] 메뉴를 숨김처리를 한다.")
        void hide() {

        }

        @Nested
        class 메뉴등록여부검증 {

            @Test
            @DisplayName("[실패] 등록되지않은 메뉴 아이디인 경우 메뉴를 숨김해제 처리가 되지 않는다.")
            void 메뉴_미등록() {

            }

        }

    }
}
