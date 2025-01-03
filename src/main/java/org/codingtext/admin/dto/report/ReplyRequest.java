package org.codingtext.admin.dto.report;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.codingtext.admin.domain.ReportType;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReplyRequest {
    @Schema(description = "신고자 ID", example = "1")
    private long reporterId;

    @Schema(description = "신고 대상자 ID", example = "2")
    private long reportedId;

    @Schema(description = "신고 대상 게시글 ID", example = "3")
    private long articleId;

    @Schema(description = "신고 대상 댓글 ID", example = "4")
    private long replyId;

    @Schema(description = "신고 유형", example = "OTHER")
    private ReportType reportType;

    @Schema(description = "사용자가 입력한 추가적인 설명", example = "이 댓글은 부적절한 내용이 포함되어 있습니다.")
    private String customDescription;
}
