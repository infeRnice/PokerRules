package com.handi.munda.poker.data.repository

import com.handi.munda.poker.domain.HandiMundaPokerAppRuleItem
import com.handi.munda.poker.domain.TitleContentGapContentItem
import com.handi.munda.poker.domain.TitleContentItem
import com.handi.munda.poker.domain.TitleContentTitleTextItem
import com.handi.munda.poker.domain.TitleDoubleImageContentItem
import com.handi.munda.poker.domain.TitleImageContentImageContentItem
import com.handi.munda.poker.domain.TitleImageContentItem
import com.handi.munda.poker.domain.repository.HandiMundaRepository

class HandiMundaRepositoryImpl : HandiMundaRepository {

    private val rules = listOf(
        TitleContentItem(1, "How to Play Poker \n   for Beginners", "Poker is undoubtedly one of the most iconic card games, offering a unique blend of strategy, skill, and odds. If you’re new to the poker world, you’re in the right place. In this guide, we’ll provide you with all the essential rules, introduce you to key poker terms, and share some practical strategies to get you started on your poker journey. Let’s shuffle the cards, take a seat at the table, and talk about poker!\n" +
                "\n" +
                "Poker basic rules\n" +
                "In Texas Hold’em, the most common variant, players aim to create the best 5-card poker hand by combining their two hole cards with the five community cards on the table.\u2028\n" +
                "Poker cards\n" +
                "Hole cards refer to the private cards dealt face down to each player at the beginning of a hand. Hole cards are also known as “pocket cards.” These cards are revealed to other players during the showdown. In Texas Hold’em, each player receives two hole cards at the start of the hand. These hole cards are unique to each player and are kept secret from the other players at the table.\n" +
                "\n" +
                "Community cards are cards dealt face-up in the center of the poker table and are shared by all players. Together, they are often referred to as the board. Community cards are used in combination with each player’s hole cards to form the best possible 5-card hand."),
        TitleImageContentItem(2, "Poker hands", "image1rule2", "Royal Flush — A sequence of five cards of the same suit, ranked from ace to ten (e.g., A♥K♥Q♥J♥T♥ — note: T=10).\n" +
                "Straight Flush — Five consecutive cards of the same suit* (e.g.,9♣8♣7♣6♣5♣). Note: Cards that are close in number and have the same suit are called suited connectors because they can connect to form straight flushes.\n" +
                "Four of a Kind — Four cards of the same rank (e.g., Q♣Q♥Q♦Q♠4♦).\n" +
                "Full House — Three cards of one rank and two cards of another rank (e.g., J♣J♥J♠8♦8♥).\n" +
                "Flush — Any five cards of the same suit (e.g., A♠J♠8♠5♠2♠).\n" +
                "Straight — Five consecutive cards of different suits (e.g., Q♣J♦10♥9♠8♦).\n" +
                "Three of a Kind — Three cards of the same rank (e.g., 8♣8♠8♦K♣4♥).\n" +
                "Two Pair — Two cards of one rank and two cards of another rank (e.g., A♠A♣J♦J♣7♠).\n" +
                "One Pair — Two cards of the same rank (e.g., 10♥10♣9♥4♦2♦).\n" +
                "High Card — Five unmatched cards (e.g., A♣J♦10♠5♣2♥, referred to as “ace-high”)."),
        TitleContentTitleTextItem(3, "  Cash game versus \n  tournament poker\n", "Poker is usually played between 6 to 10 players. In casino cash games, players can usually join or leave the table at any time between rounds. They can also buy more chips within the set table limits when needed. Tournaments or tournament-style games are elimination-based. Players start out with the same amount of chips, and the game continues until one player wins everything. However, the basic flow of the game remains the same. Let’s look at how a standard poker round is dealt and played.\n", "Poker-based games", "If the prospect of facing off against fellow players feels intimidating, or if you’re looking for a more relaxed card gaming experience, check out our live casino poker variants, such as:\n" +
                "Casino Hold’em\n" +
                "Ultimate Texas Hold’em.\n" +
                "These player-versus-dealer games frequently feature optional side bets based on the hand rankings we’ve discussed, offering diverse payout opportunities. Now, let’s return to the classic Texas Hold’em."),
        TitleContentGapContentItem(4, "Starting the Hand\n", "Button: One player is designated as the button (or dealer) responsible for dealing cards in home games. The two players immediately to the left of the button post the small blind and big blind, initiating the betting and forming the pot. The small blind is half the amount of the big blind (e.g., 50 cents and \$1). The player to the immediate left of the big blind commences the action by choosing one of three options:\n" +
                "Calling the big blind amount with \$1.\n" +
                "Raising by at least \$2 (\$1 on top of the \$1 needed to call).\n" +
                "Folding the hand.", "The action proceeds clockwise around the table, with only players who haven’t folded participating in subsequent betting rounds.\n" +
                "Four betting rounds are in total: Pre-flop, Flop, Turn, and River, and community cards are dealt during these rounds."),
        TitleImageContentItem(5, "Betting rounds\n", "image1rule5", "Pre-flop\n" +
                "During the pre-flop phase, you base their decisions solely on your two hole cards. These cards can have innate value if you are dealt a pair (9,9), or they can have potential value in their ability to connect with the board. High cards such as Aces of Kings are more likely to form valuable hands after the flop than 3s or 2s.\n" +
                "Flop\n" +
                "The game’s dynamics shift dramatically with the arrival of the flop. At this point, three community cards are unveiled in the center of the table. If you held JT before the flop, and the flop reveals J-6–2, you now possess a top pair of jacks.\n" +
                "Post-flop, you are already exposed to 5 out of the 7 potential cards that will constitute your poker hand, giving you a good sense of the strength of your hand. Once the flop is displayed, betting starts from the small blind, and the action proceeds clockwise."),
        TitleContentItem(6, "Betting rounds\n", "Turn\n" +
                "The turn reveals the fourth community card. Betting on the turn follows the same pattern as during the flop. If there was betting and calling on the flop, the pot size can become substantial, making the turn a crucial moment where pivotal decisions in hand often occur. The final card, the River, is revealed if the hand doesn’t end on the turn.\n" +
                "River\n" +
                "Players are dealt the fifth and final community card during the River phase. You now have the complete picture of your hand. This marks the final betting round. If there was betting on previous streets, it’s common for someone to make a substantial bet or even go all-in with all their chips during the river. When two or more players reach the showdown by not folding their hands, the cards are revealed, and the player holding the best 5-card poker hand claims the pot. This climactic moment is known as the showdown.\n" +
                "Betting\n" +
                "Remember, if all players except one have folded their hole cards during any of the betting rounds, the hand concludes without the need for the betting player to reveal their hole cards. Engaging in betting without holding a strong poker hand is known as bluffing, and it constitutes a significant element of poker strategy. By contrast, a bet made with a strong hand is known as value-betting. A balanced strategy will employ both bluffing and value betting to maximize your earning potential.\n" +
                "Most poker hands reach their conclusion before the showdown. Revealing another player’s hole cards provides valuable insights to opponents, shedding light on their strategic decisions and the hands they choose to play."),
        TitleContentItem(7, "Betting options\n", "1.Check: If no one has bet in the current round, you can check, passing the action to the next player without putting additional chips into the pot.\n" +
                "2.Bet: You can initiate betting by placing chips into the pot. Other players must match this bet (call), raise it, or fold it.\n" +
                "3.Call: Match the current bet to stay in the hand.\n" +
                "4.Raise: You can increase the current bet, forcing other players to match the new amount, re-raise or fold.\n" +
                "5.Re-raise: Raising a raise.\n" +
                "6.Fold: If you believe your hand is weak, you can fold and forfeit any bets you’ve made to avoid potentially losing more."),
        TitleContentItem(8, "Betting rules\n", "Bet and raise limits:\n" +
                " • In Texas Hold ’em, the minimum bet is the current value of the big blind.\n" +
                " • The minimum raise must be at least equal to the previous bet or raise in the current betting round. For example, if a player bets \$20, the minimum raise would be \$20 more.\n" +
                " • In No-limit games, players can raise any amount of chips they have in front of them.\n" +
                " • In Fixed-limit games, the maximum raise is determined by the specific rules of the game and the betting limits for each round.\n" +
                "Side Pots:\n" +
                " • In Texas Hold’em, side pots may be created when players go all-in with different chip amounts. The all-in players contest the main pot, while the remaining players can compete for a separate side pot.\n" +
                "Blinds\n" +
                " • Blinds in poker are forced bets that two players must make before a new hand begins. These bets ensure that there is some money in the pot to compete for, even before anyone receives their hole cards (the initial cards dealt to each player).\n" +
                "A standard poker game has two types of blinds: the Small Blind (SB) and the Big Blind (BB). At the beginning of the game, the player sitting directly to the left of the dealer button posts the Small Blind, and the next player to their left posts the Big Blind. The Small Blind is typically half the minimum bet for that round, and the Big Blind is the minimum bet."),
        TitleImageContentImageContentItem(9, "Positions in poker\n", "image1rule9", "In poker, the positions at the table play a crucial role in shaping your strategy and decision-making. Each position offers a different perspective and advantage, and understanding them can significantly improve your poker skills. Here, I’ll explain the various hand positions in depth:\n", "image2rule9", "The player in the button position is considered the dealer for the current hand. This position is advantageous because you act last in every betting round except the pre-flop. Being on the button lets you gather information about your opponents’ actions before making decisions. It’s often called the “best” position at the table.\n"),
        TitleImageContentItem(10, "Positions in poker\n", "image1rule10", "Small Blind (SB)\n" +
                "The small blind is the player sitting to the left of the button. This player is required to post a forced bet before the start of each hand. The small blind acts second to last in the first round (preflop) and last in all subsequent betting rounds. Due to the forced blind, the small blind can be disadvantaged in terms of position.\u2028Big Blind (BB)\n" +
                "The big blind is the player to the left of the small blind. Similar to the small blind, the big blind is also required to post a forced bet, which is typically twice the size of the small blind. The big blind acts last in the preflop betting round and second in all other rounds. The blinds are considered early positions post-flop.\n"),
        TitleImageContentItem(11, "Positions in poker\n", "image1rule11", "Early Positions (EP)\n" +
                "Early positions include the players who act before most of the table. These positions include the Under the Gun (UTG), UTG+1, and UTG+2. UTG is the player immediately to the left of the big blind, and UTG+1 and UTG+2 follow in clockwise order.\n" +
                "The term “Under the Gun” comes from the world of firearms, which means being in a vulnerable position, typically first in line and at a disadvantage. In poker, the UTG position is the player directly to the left of the big blind. UTG is often considered the toughest position because it’s like being “under fire” from opponents who act after you. You have limited information and must proceed cautiously. UTG players usually play very tight, favoring strong hands due to their positional vulnerability.\n" +
                "Players in early positions have less information about their opponents’ intentions since they must act before many others. Consequently, they typically play tighter and more cautiously as they face the risk of stronger hands after them."),
        TitleImageContentItem(12, "Positions in poker\n", "image1rule12", "Middle Positions (MP)\n" +
                "Middle positions include players who act after the early positions but before the late positions.\n" +
                "MP1, MP2, and MP3 follow the UTG+2 player and precede the late positions.\n" +
                "Players in middle positions have a bit more information than those in early positions but must still exercise caution when opening with weaker hands."),
        TitleDoubleImageContentItem(13, "Positions in poker\n", "image1rule13", "image2rule13", "Late Positions (LP)\n" +
                "Late positions are highly advantageous because you act later in every betting round, which allows for more strategic flexibility. Hijack (HJ), Cutoff (CO), and Button (BTN) are late positions.\u2028Hijack (HJ): The term “Hijack” suggests taking control or advantage of a situation. In poker, the Hijack position is two seats to the right of the button and is named for its ability to “hijack” the late position advantages. The Hijack is considered a strong position, as it allows you to open with a wider range of hands and apply pressure to players in earlier positions.\u2028Cutoff (CO): The term “Cutoff” refers to the player who is “cutting off” the button’s position. It’s one step closer to the button. The Cutoff position is highly desirable because it provides a great balance between information and aggression. Players in the CO can open with a wide range of hands and steal the blinds effectively.\n"),
        TitleContentItem(14, " Beginner poker strategy\n", "What are poker ranges?\n" +
                "In poker, a range refers to the set of possible hands that a player may have in a given situation. Understanding and utilizing poker ranges is crucial for making informed decisions at the table. Players must consider their own range, their opponents’ likely ranges, and how those ranges interact with the community cards to make strategic choices during a hand.\n" +
                "Thanks to modern computing, we now have a more precise grasp of the statistically optimal approach to playing different types of hands in specific game situations. Although factors like intuition, playstyle, and your opponents still hold significance in poker, making decisions at the table relies less on guesswork.\u2028\n" +
                "When to pre-flop raise?\n" +
                "Pre-flop raising is a fundamental poker strategy where a player increases the initial bet size before the community cards are revealed. Raising with strong hands, such as high pairs and premium suited connectors is ideal, but in the long run you won’t get away with playing this tight. Raising with a broader range of hands is an essential tool to gain control of the pot and apply pressure. As a consequence, you should aim to raise with premium hands and raise sometimes with above average hands. Consider factors like your hole cards’ strength, position at the table, opponents’ tendencies, and table dynamics when deciding when to raise.\n" +
                "Here are some range charts outlining the hands you should consider raising with, and the ones you should fold with, depending on your position:"),
        TitleContentItem(15, " What about the \n  big blind?", "In poker, the big blind (BB) plays a unique role in the pre-flop betting round, setting it apart from other positions. Here’s how big blinds differ in the pre-flop stage:\n" +
                "Forced Bet: The big blind is a forced bet that must be posted before any hole cards are dealt. The player sitting in the big blind position must post an amount equal to the minimum bet (the big blind amount) for that specific hand.\n" +
                "Position: The big blind is considered one of the least favorable positions at the poker table, especially in Texas Hold’em. This is because players in this position act very early post-flop. They lack information about other players’ intentions, making it more challenging to make informed decisions.\n" +
                "Defending the Blind: One of the common strategies for big blinds is to “defend the blind.” This means taking an aggressive stance to protect their blind bet. If a player in the big blind faces a raise from a late-position player who may be attempting a steal, they might choose to call or re-raise with a strong or potentially playable hand. This can deter opponents from raising the big blind too frequently.\n" +
                "Vulnerable to Steals: Players in the big blind position are vulnerable to steal attempts from late-position players (e.g., the button or cutoff). Since they act first post-flop, it’s often tempting for late-position players to make a small raise to try and steal the big blind. Big blind players must decide whether to defend their blind with a call, re-raise (a “3-bet”), or fold."),
        TitleContentItem(16, "3-Betting\n", "• 3-Betting In Position (IP): In position, you have a positional advantage, so your 3-betting range can be wider. You can include both value hands and some bluffs. Here’s a sample 3-betting range for IP:\n" +
                "• Value Hands: Include strong hands like AA, KK, QQ, JJ and strong broadway hands like AKs and AKo. You want to build the pot with these hands.\n" +
                "• Bluffs: Include suited connectors like 98s, 76s, and some broadway hands like AQo and AJs. These can work well as bluffs because they can flop well.\n" +
                "• 3-Betting Out of Position (OOP): When 3-betting out of position, you want to be more cautious because you’ll have to act first post-flop. Your 3-betting range OOP should be stronger and weighted more towards value hands. Here’s a sample OOP 3-betting range:\n" +
                "• Value Hands: Focus on premium hands like AA, KK, QQ, and JJ.\n" +
                "• Bluffs: Be selective with your bluffs. You can include some suited connectors like 98s, but avoid weaker hands. Having some bluffs to balance your range is crucial, but they should have potential post-flop playability.\n" +
                "• Remember to adjust your 3-betting range based on your opponent’s tendencies and your situation. Against tight opponents, you can widen your 3-betting range, and against loose opponents, you might tighten it up."),
        TitleContentItem(17, "Post-flop strategy\n", "Continuation Betting\n" +
                "\n" +
                "• Continuation Betting (C-betting) is a fundamental post-flop strategy in poker that involves making a bet on the flop after being the pre-flop aggressor (the player who raised before the flop). It’s a common tactic used to maintain initiative, pressure opponents, and potentially win the pot without a showdown. Here’s a more in-depth explanation of continuation betting and when it’s appropriate:\n" +
                "• Why should you C-Bet?\n" +
                "• The primary purpose of a continuation bet is to extract value from your opponents. If you have a strong hand, you want your opponents with weaker hands to pay to see the next card. This builds the pot when you’re ahead.\n" +
                "• Another key purpose is to make your opponents fold. By betting, you pressure players with marginal or weak hands, forcing them to make difficult decisions. Ideally, they fold, allowing you to win the pot without having to show your cards.\n" +
                "• A common c-bet size is 50–70% of the pot."),
        TitleContentItem(18, "When should you \n       C-Bet?", "• Favorable flop: C-betting is more appropriate when the flop is uncoordinated and is less likely to help your opponents’ hands. If the flop is low and unconnected (e.g., 2–7-Q), it’s a good time to C-bet.\n" +
                "• Pre-flop Aggressor: A C-bet is often expected if you were the pre-flop aggressor and raised from an early or middle position. This follows the narrative that you have a strong hand.\n" +
                "• Few Opponents: C-betting is more effective when you’re heads-up or against a small number of opponents. With fewer players, there are fewer chances that someone has a strong hand.\n" +
                "• Read on Opponents: A C-bet can be profitable if you believe your opponents are likely to fold to aggression.\n" +
                "If your situation fits one or more of these criteria, and your position and hand are strong enough, consider c-betting."),
        TitleContentItem(19, "Stack-to-pot ratio\n", "Stack-to-pot ratio\n" +
                "The Stack-to-Pot Ratio is a crucial post-flop concept that measures the ratio of a player’s remaining stack size to the current size of the pot. It helps players determine whether they should go all-in, make smaller bets, or fold based on the available chips and the pot size.\u2028\n" +
                "Turn and River Tips\n" +
                "Strategic considerations become even more critical on the turn and river (the fourth and fifth community cards). Players must reassess the strength of their hand, anticipate opponents’ possible hands, and make well-timed bets or calls. Some key tips include balancing your range, using pot odds to make decisions, and avoiding overcommitting with marginal hands.\u2028\n" +
                "Bluffing\n" +
                "Many players have a preconceived idea that bluffing is a mind-reading psychological battle where you must decipher your opponent’s innermost thoughts. While reading opponents can be valuable, the reality is that successful bluffing is about strategic decision-making. You rarely can tell your opponent’s exact hand, and you don’t have to. Instead, try to think in terms of ranges and what this player could have. Bluffing involves creating a believable narrative through your actions — your bets, raises, and timing. It’s about making your opponent doubt the strength of their hand and convincing them to fold."),
        TitleContentItem(20, "Post-flop scenarios\n", "Let’s look at bluffing in the context of post-flop scenarios. It allows you to win pots even when your strong starting hand doesn’t connect well with the community cards on the flop, turn, or river. But when is it worth the risk? Here’s how to approach bluffing:\n" +
                "1.Assess the situation: Start by assessing your hand. If you had a strong pre-flop hand (e.g., high pairs, premium cards), but the flop didn’t help you, consider whether any draws* or potential cards might make your opponent fold. Consider your opponents’ tendencies and how they’ve been playing. Are they likely to fold to aggression, or are they calling stations that tend to call down with weaker hands?\n" +
                "2.*Note: In poker, a “draw” refers to a hand that is not yet complete but has the potential to become a strong hand with the addition of one or more specific cards from the remaining community cards.\n" +
                "3.Identify Potential Scare Cards: Look at the community cards on the board and identify any potential scare cards that could make your opponent worry about their hand. For example, if three cards of the same suit are on the flop and turn, representing a potential flush, this can be a scare card.\n" +
                "4.Overcards on the board (cards higher than those in your hand) can also be seen as scare cards, especially if they’re coordinated and might have connected with your opponent’s range."),
        TitleContentItem(21, "Post-flop scenarios\\n", "5. Choose Your Bluffing Spot: Pick the right moment to bluff. Ideally, bluff when you have a solid reason to believe your opponent has a weak hand and can be persuaded to fold. This may be when they’ve shown weakness themselves or seem hesitant. Bluffing into multiple opponents can be riskier, so consider your table position and the number of players remaining in the hand.\n" +
                "6.Determine Your Bluff Size: Your bet size should reflect the story you’re trying to tell with your bluff. A larger bet may look more intimidating and suggest a strong hand, while a smaller bet may look like a value or blocker bet. Adjust your sizing accordingly.\n" +
                "7.Maintain a Balanced Range: Keep your opponents guessing and prevent them from catching on to your bluffs. This means occasionally bluffing with hands that have good bluffing potential, even if you also bluff with strong hands. This helps disguise your true intentions.\n" +
                "8.Be Prepared to Fold: Keep in mind that bluffing can backfire, and your opponent may call or raise your bluff. Be prepared to fold if you encounter resistance, especially if your opponent is showing signs of strength.\n" +
                "9.Observational Skills: Continuously observe your opponents’ reactions to your bets and their overall gameplay. If you notice patterns or tells that indicate when they’re weak or strong, use this information to inform your bluffing decisions.\n" +
                "10.Remember that successful bluffing in poker is about making well-timed and calculated bluffs based on your assessment of the situation and your opponents. It requires practice, observation, and the ability to think ahead. Bluffing is essential to being a well-rounded player."),

        )

        override fun getRuleById(ruleId: Int): HandiMundaPokerAppRuleItem {
        return rules.firstOrNull { it.id == ruleId }
            ?: throw NoSuchElementException("Rule with ID $ruleId not found")
    }
}


