package org.codingtext.admin.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "USER_REPORT")
public class UserReport extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Long id;

    @Column(name = "reported_user_id", nullable = false)
    private Long reportedUserId; // 신고당한 사람의 아이디

    @Column(name = "reporting_user_id", nullable = false)
    private Long reportingUserId; // 신고한 사람의 아이디

    @Column(name = "article_id")
    private Long articleId;

    @Column(name = "reply_id")
    private Long replyId;

    @Enumerated(EnumType.STRING)
    @Column(name = "report_type", nullable = false)
    private ReportType reportType;

    @Column(name = "report_custom_description")
    private String customDescription; //신고사유 직접입력, ReportType이 Custom이 아닐 경우에는 null
}
