package com.chess.email.matchplay.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: huang yuan li
 * @Description:
 * @date: Create in 下午 5:34 2019/4/2 0002
 * @Modifide by:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchGameInfo {
    private String otherUserName;
    private int matchType;
    private String userNameState;
}